package com.mas.sow.quranplayer.util;

import java.io.File;
import java.io.FileFilter;

/**
 * Created by Sow on 2015/03/29.
 */
public class FileUtil {
    private static final String TAG = FileUtil.class.getName();

    public static void scanDirectory(File scanFile){
        File[] files = scanFile.listFiles(new AudioFilter());

        if( files != null){
            for( File file : files ){
                if( file.isDirectory() ){
                    if( hasAudioFile( file ) ){
                        LogUtil.d(TAG, file.getName());
                    }
                    scanDirectory( file );
                }
            }
        }
    }

    private static boolean hasAudioFile(File dir){
        File[] files = dir.listFiles();
        if(files != null){
            for( File file : files){
                if( !file.isDirectory() ){
                    if( file.getName().toLowerCase().endsWith( MediaConstants.TYPE_MP3)){
                        return true;
                    }
                }
            }
        }
        return  false;
    }

    private static class AudioFilter implements FileFilter {
        private String[] extension = { MediaConstants.TYPE_MP3};

        @Override
        public boolean accept(File file) {
            if( file.isDirectory() && !file.isHidden()){
                return true;
            }

            for( String ext : extension ){
                if( file.getName().toLowerCase().endsWith( ext)){
                    return true;
                }
            }
            return false;
        }
    }
}

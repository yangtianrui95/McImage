package com.smallsoho.mcplugin.image.models

class Config {
    def maxSize = 1 * 1024 * 1024
    def isCheck = true
    def isCompress = true
    def isWebpConvert = true
    def isJPGConvert = true
    def enableWhenDebug = true
    def isCheckSize = true
    def maxWidth = 500
    def maxHeight = 500
    Iterable<String> whiteList = []
}

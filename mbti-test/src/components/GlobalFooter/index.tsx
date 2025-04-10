import React, {Component, PropsWithChildren} from 'react'
import {View, Image} from '@tarojs/components'
import {AtButton} from 'taro-ui'
import headerBg from "../../assets/images/headerBg.png";
import "taro-ui/dist/style/components/button.scss" // 按需引入
import './index.scss'
import Taro from "@tarojs/taro";


/**
 * 全局底部栏组件
 */
export default () => {
  return (
    <View className="globalFooter">
      作者：程序员llyb
    </View>
  );
};


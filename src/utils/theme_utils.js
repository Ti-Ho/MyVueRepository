const theme = {
  chalk: {
    // 背景颜色
    backgroundColor: '#161522',
    // 标题的文字颜色
    titleColor: '#ffffff',
    // 切换主题按钮的图片路径
    themeSrc: 'qiehuan_dark.png',
    tableHeaderBackColor: '#222733',
    tableHeaderColor: '#999',
    tableRowBackColor: '#222733',
    tableRowColor: '#888',
    dividerColor: '#003399'
  },
  vintage: {
    backgroundColor: '#eeeeee',
    titleColor: '#000000',
    themeSrc: 'qiehuan_light.png',
    tableHeaderBackColor: 'white',
    tableHeaderColor: 'black',
    tableRowBackColor: 'white',
    tableRowColor: '#666',
    dividerColor: '#999'
  }
}

export function getThemeValue (themeName) {
  return theme[themeName]
}

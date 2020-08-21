## 安装

```shell script
eeui plugin install eeui/notifications
```

## 卸载

```shell script
eeui plugin uninstall eeui/notifications
```

## 引用

```js
const notifications = app.requireModule("eeui/notifications");
```

## 调用方法

```js
/**
 * 通知
 * @param params {id:, title:, body:} 
 */
notifications.notify(JSON params);

/**
 * 根据ID清除指定通知
 * @param id
 */
notifications.clearId(int id);

/**
 * 根据标题清除指定通知
 * @param title
 */
notifications.clearTitle(String title);

/**
 * 清除所有通知
 */
notifications.clearAll();
```
## 安装

```shell script
eco plugin install https://github.com/kjeco/notifications
```

## 卸载

```shell script
eco plugin uninstall https://github.com/kjeco/notifications
```

## 引用

```js
const notifications = app.requireModule("eco/notifications");
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
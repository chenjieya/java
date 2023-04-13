export default function cjajax(options) {
  var url = options.url || '';
  var type = options.type.toUpperCase() || 'GET';
  var data = options.data || '';
  var success = options.success || function () { };
  var error = options.error || function () { };
  var timeover = options.timeover || function () {};
  var async = typeof options.async == 'boolean' ? options.async : 'true';
  var timeout = options.timeout||3000;//超时处理，默认8s
  // 请求拦截
  var beforeSend = options.beforeSend || function (xhr) { return xhr};

  var xhr = null;
  if (window.XMLHttpRequest) {
    xhr = new XMLHttpRequest();
  } else if (window.ActiveXObject) {
    xhr = new ActiveXObject("Microsoft.XMLHttp");
  } else {
    return alert('当前浏览器不支持XMLHTTPRequest');
  }

  // xhr.readyState 0 - 4
  // 0 建立连接之前
  // 1 建立连接，调用open方法
  // 2 open调用完了，等待发送数据
  // 3 正在发送数据
  // 4 整个请求已经完成，对方已经给予回应
  xhr.onreadystatechange = function () {
    if (xhr.readyState === 4) {
      if (xhr.status === 200) {
        success(JSON.parse(xhr.responseText));
      }
      // else {
      //     error(JSON.parse(xhr.responseText));
      // }
    }
  }

  xhr.ontimeout = function () {
    timeover()
  }
  // 监听到错误之后 调用error回调函数
  xhr.onerror = function (err) {
    error(new Error(err));
  }

  // 默认情况下不执行，如果我们传入 false就拦截，不执行下面的代码了
  if(!beforeSend(xhr)){
    return false;
  }

  if (type === 'GET') {
    xhr.open(type, url + '?' + data, async);
    xhr.timeout = timeout;
    xhr.send();
  } else {
    xhr.open(type, url, async);
    xhr.timeout = timeout;
    xhr.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    xhr.send(data);
  }
}
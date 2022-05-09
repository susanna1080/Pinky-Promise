var customNotification = new Notification(title, options);

Notification.requestPermission(permission => {
    if(permission === 'granted') {
        // show notification
    }
});

const myNoti = new Notification('Notification Title', {
    body: 'This is my notification',
    icon: 'ICON_URL',
    image: 'IMAGE_URL'
});

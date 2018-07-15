var tag = document.createElement('script');
tag.src = "https://www.youtube.com/iframe_api";
var firstScriptTag = document.getElementsByTagName('script')[0];
firstScriptTag.parentNode.insertBefore(tag, firstScriptTag);

var player;
var pauseClicked = false;
function onYouTubeIframeAPIReady() {
    player = new YT.Player('youtube-player', {
        events: {
            'onReady': onPlayerReady,
            'onStateChange': onPlayerStateChange
        }
    });
}

function onPlayerReady(event) {
    document.getElementById("youtube-player").style.borderStyle = "solid";
    document.getElementById("youtube-player").style.borderColor = "#FFFFFF";
}

function onPlayerStateChange(event) {
    switch(event.data) {
        case 0: // ended
            document.getElementById("youtube-player").style.borderColor = "#7f7c83";
            pauseClicked = false;
            break;
        case 1: // playing
            document.getElementById("youtube-player").style.borderColor = "#32cd51";
            pauseClicked = false;
            break;
        case 2: // paused
            document.getElementById("youtube-player").style.borderColor = "#f2e30d";
            pauseClicked = true;
        case 3: // buffering
            if(!pauseClicked) {
                document.getElementById("youtube-player").style.borderColor = "#ff3232";
            }
            break;
    }
}

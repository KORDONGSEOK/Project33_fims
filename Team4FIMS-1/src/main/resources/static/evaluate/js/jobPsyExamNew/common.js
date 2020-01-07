var isPauseTime = 0;

/* 남은시간 체크 */
function f_timerSet(min,sec,oj) {
    this.minute=min;
    this.second=sec+1;
    this.timeVw=oj;
    this.str="";
    this.toggle = 0;
    this.timer=function() {
      if(this.minute < 0 || this.toggle==1) {

      }else {
        if(this.second==0) {
          this.minute=this.minute-1;
          this.second=59;
        }else {
          this.second--;
        }
      }
      if(this.second==0&&this.minute ==0){
    	  if(oj!=""){
    		  this.timeVw.innerHTML = "00:00";
    	  }
			f_timeOver();
			//alert("타임종료");
			return;
		}

      this.str = this.toggle==0?"":"-";
      this.str +=("0"+this.minute).match(/\d{2}$/)+":";
      this.str +=("0"+this.second).match(/\d{2}$/);
      this.timeVw.innerHTML = this.str;
      var callFn = arguments.callee;
      var callOj = this;
      time1=setTimeout(function(){
        callFn.call(callOj);
      }, 1000);
    }
  }
/* 남은시간 체크 (한화면에서 두번 호출하여 구분자 필요할 경우)*/
function f_timerSet(min,sec,oj,gbn) {
	this.minute=min;
	this.second=sec+1;
	this.timeVw=oj;
	this.str="";
	this.toggle = 0;
	this.timer=function() {
		if(this.minute < 0 || this.toggle==1) {

		}else {
			if(this.second==0) {
				this.minute=this.minute-1;
				this.second=59;
			}else {
				this.second--;
			}
		}
		if(this.second==0&&this.minute ==0){
			if(oj!=""){
				this.timeVw.innerHTML = "00:00";
	        }
			f_timeOver(gbn);
			return;
		}

		this.str = this.toggle==0?"":"-";
		this.str +=("0"+this.minute).match(/\d{2}$/)+":";
		this.str +=("0"+this.second).match(/\d{2}$/);
		this.timeVw.innerHTML = this.str;
		var callFn = arguments.callee;
		var callOj = this;
		time1=setTimeout(function(){
			callFn.call(callOj);
		}, 1000);
	}
}

//실행시킨 타이머 종료
function f_clearTimeOut(){
	clearInterval(time1);
}

//검사 안내듣기
function f_sound(path){
    if(1 > "0"){
        if(window.HTMLAudioElement){ //크롬
//          var soundMp = new Audio(path);
//          soundMp.play();
        	var player = document.getElementById('player');
        	player.src=path;
            player.play();


            player.addEventListener("ended", function(e){
                $('#start_button').addClass('blinking');
                setTimeout(function(){
                    $('#start_button').removeClass('blinking');
                }, 5000);
			}, false);

            player.onpause = function(e){
                $('#start_button').addClass('blinking');
                setTimeout(function(){
                    $('#start_button').removeClass('blinking');
				}, 5000);
            };

        } else {//익스
            var ie_player = document.getElementById("ie_player");
            ie_player.fileName = path;
            ie_player.play();

            ie_player.onpause = function(e){
                $('#start_button').addClass('blinking');
                setTimeout(function(){
                    $('#start_button').removeClass('blinking');
                }, 5000);
            };
        }
    }
}

//검사 안내듣기
function f_sound2(path, targetControl){
    if(1 > "0"){
        if(window.HTMLAudioElement){ //크롬

            var player = document.getElementById('player');
            player.src=path;
            player.play();

            player.addEventListener("ended", function(e){
                $('#' + targetControl).addClass('blinking');
                setTimeout(function(){
                    $('#' + targetControl).removeClass('blinking');
                }, 5000);
            }, false);

            player.onpause = function(e){
                $('#' + targetControl).addClass('blinking');
                setTimeout(function(){
                    $('#' + targetControl).removeClass('blinking');
                }, 5000);
            };

        } else {//익스
            var ie_player = document.getElementById("ie_player");
            ie_player.fileName = path;
            ie_player.play();

            ie_player.onpause = function(e){
                $('#' + targetControl).addClass('blinking');
                setTimeout(function(){
                    $('#' + targetControl).removeClass('blinking');
                }, 5000);
            };
        }
    }
}

//검사 안내끄기
function f_sound_off(){
	if(1 > "0"){
		if(window.HTMLAudioElement){ //크롬
			var player = document.getElementById('player');
			player.pause();
			player.currentTime = 0;
		} else {//익스
			var ie_player = document.getElementById("ie_player");
			ie_player.stop();
		}
	}
}

//백스페이스 새로고침 방지
function keyDownEvent(e){

	if(e.keyCode == 8 || e.keyCode == 116){
		if(e.keyCode == 8){
			var t = document.activeElement;
			if(t.tagName != "INPUT"){
				if(e){
					e.preventDefault();
				}else{
					event.keyCode = 0;
					event.cancelBubble = true;
					event.returnValue = false;
				}
			}
		}else{
			if(e){
				e.preventDefault();
			}else{
				event.keyCode = 0;
				event.cancelBubble = true;
				event.returnValue = false;
			}
		}
	}
}

//마우스 오른쪽 방지
function contextMenuButton(e){
	if(e){
		if(e.button == 2){
			e.preventDefault();
		}
	}else{
		if(e.button == 2){
			event.keyCode = 0;
			event.cancelBubble = true;
			event.returnValue = false;
		}
	}
}

//------------------------------------------------------------
//브라우저 판별
//------------------------------------------------------------
var navName = navigator.appName ;
var brVer = navigator.userAgent;
var brNum;
var reg = new RegExp('/');

function getOsNm(){
	if (navigator.appName == 'Microsoft Internet Explorer')
	{
		verNumIE() ;
	}
	else
	{
		verNumOt() ;
	}
}


function verNumIE()
{
	var brVerId = brVer.indexOf('MSIE');
	navName = 'Explorer';
	brNum = brVer.substr(brVerId+5,3);
	Machine();
}

function verNumOt()
{
	var brVerId = brVer.lastIndexOf("/");
	brNum = brVer.substring(brVerId+1);
	Machine();
}

function Machine()
{
	var theAgent   = navigator.userAgent;
 	theAgent   = theAgent.toUpperCase();

	if ( theAgent.indexOf("WIN") >= 0)
	{
		if (theAgent.indexOf("3.1") >= 0)
		 	document.bodyform.osNm.value = "Win 3.1";
		if (theAgent.indexOf("95") >= 0)
		 	document.bodyform.osNm.value = "Win 95";
		if (theAgent.indexOf("98") >= 0)
		 	document.bodyform.osNm.value = "Win 98";
		if (theAgent.indexOf("NT") >= 0)
		 	document.bodyform.osNm.value = "Win NT";
		if (theAgent.indexOf("NT 5.0") >= 0)
			document.bodyform.osNm.value = "Win 2000";
		if (theAgent.indexOf("NT 5.1") >= 0)
			document.bodyform.osNm.value = "Win XP";
		if (theAgent.indexOf("NT 5.2") >= 0)
			document.bodyform.osNm.value = "Win 2003";
		if (theAgent.indexOf("NT 6.0") >= 0)
			document.bodyform.osNm.value = "Win Vista";
		if (theAgent.indexOf("NT 6.1") >= 0)
			document.bodyform.osNm.value = "Win 7";
		if (theAgent.indexOf("NT 6.2") >= 0)
			document.bodyform.osNm.value = "Win 8";
		if (theAgent.indexOf("NT 6.3") >= 0)
			document.bodyform.osNm.value = "Win 8.1";
		if (theAgent.indexOf("NT 6.4") >= 0)
			document.bodyform.osNm.value = "Win 10";
	}
	if ( theAgent.indexOf("MAC") >= 0)
	{
		document.bodyform.osNm.value = "MACOS";
		if (theAgent.indexOf("68K") >= 0)
			document.bodyform.osNm.value = "MacOS";
		if (theAgent.indexOf("PPC") >= 0)
			document.bodyform.osNm.value = "MacOS";
		if (theAgent.indexOf("POWER") >= 0)
			document.bodyform.osNm.value = "MacOS";
	}
	if (theAgent.indexOf("FREEBSD") >= 0)
		document.bodyform.osNm.value = "FreeBSD";
	if (theAgent.indexOf("NETBSD") >= 0)
		document.bodyform.osNm.value = "NetBSD";
	if (theAgent.indexOf("OPENBSD") >= 0)
		document.bodyform.osNm.value = "OpenBSD";
	if (theAgent.indexOf("BSDI") >= 0)
		document.bodyform.osNm.value = "BSDi";
	if (theAgent.indexOf("FRINBSD") >= 0)
		document.bodyform.osNm.value = "FrinBSD";
	if (theAgent.indexOf("LINUX") >= 0)
		document.bodyform.osNm.value = "Linux";
	if (theAgent.indexOf("SUN") >= 0)
	{
		var v = theAgent.indexOf("SUNOS");
		v = eval(theAgent.substring(v+6,v+8));
		if (v <= 4.1)
			document.bodyform.osNm.value = "sunOS";
		else
     	document.bodyform.osNm.value = "Solaris";
	}
	Browser();
}

function Browser()
{
	document.bodyform.brwsrNm.value=navName;
	document.bodyform.brwsrVer.value=brNum;
	document.bodyform.userAgntInfo.value=brVer;
}

//숫자만을 기입받는 함수
function onlyNum(obj){
	var code = window.event.keyCode;
	//alert(window.event.keyCode);
	if((code != 8)&&(code != 46)&&(code != 37)&&(code != 39)&&(code != 9)){
		//코드값 : Bakspace (8), delete (46), ← (37), → (39)
  		if((code < 48) || (code > 57)){//숫자키
  			if ((code < 96)||(code > 105)){//숫자키 (Num Lock)
  				alert("숫자만 입력할 수 있습니다.");
  				obj.value = "";

  				if(event.preventDefault){	//ie11
  					event.preventDefault();
  				}else{						//ie7~ie10
  					window.event.returnValue = false;
  				}
  			}
  		}
	}
}


//직업심리검사 직업분류표 모달팝업
function openModalPopup(url, obj, width, height) {

	var agent = navigator.userAgent.toLowerCase();

  if (agent.indexOf("msie 7") > -1) {

  } else if (agent.indexOf("msie") > -1) {
      height += 56;
  }

  var	options	= "help:no;scroll:no;status:yes;resizable:yes;menubar:no;titlebar:no;toolbar:no;center:yes;"
          + "dialogWidth:"+width+"px;dialogHeight:"+height+"px;";

	if(agent.indexOf("chrome") > -1){
		window.open(url, "", "width="+width+", height="+height+", resizable=1, scrollbars=no, status=0, titlebar=0, toolbar=0, left=300, top=200");
	}else{
	    var	result = window.showModalDialog(url, obj, options);

	    return result;
	}
}
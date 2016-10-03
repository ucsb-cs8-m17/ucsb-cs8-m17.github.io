---
layout: defaultWithClock
num: e01
exam_end: "2016-10-19 13:45:00 -0700"
---

<div class="clock"></div>
<script>
  var clock = $('.clock').FlipClock({
      	    clockFace: 'TwelveHourClock',
	    showSeconds: false
	    	       });
</script>


{% if page.exam_end %}
<div class="countdown-clock"></div>
<script>

 var exam_end = "{{page.exam_end}}";
 var secondsRemaining = moment(exam_end).diff(moment(),'seconds');
 console.log("secondsRemaining = " + secondsRemaining);
 var countDownClock = $('.countdown-clock').FlipClock(secondsRemaining,{
            countdown: true,	    	  
      	    clockFace: 'DailyCounter',
	    showSeconds: false
	    	       });
</script>
{% endif %}


# Typo corrections, Clarifications, Hints for {{site.qtr}} exam {{page.num}}

Typo corrections, clarifications and hints will be placed on this page during the exam.



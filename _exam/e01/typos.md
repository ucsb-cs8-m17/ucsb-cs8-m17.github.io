---
layout: defaultWithClock
num: e01
exam_end: "2016-10-19 13:45:00 -0700"
---

<style>
  .clock { float:right; width:400px; margin: 2em; border:1px solid black; padding: 2em; white-space: nowrap; }
  .countdown-clock { float:left; width: 500px; margin: 1em; border:1px solid black; padding: 2em 1em 0em 1em; white-space: nowrap;}
</style>

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


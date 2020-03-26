	function clikker(a,b)
	{
		if (a.style.display =='')
		{
			a.style.display = 'none';
			b.src='images/portlet/show.gif';
		}
		else
		{
 			a.style.display='';
			b.src='images/portlet/hide.gif';
		}
	}
function hideN(obj) {
 obj.className='content';
}

function showN(obj) {
  obj.className='content_on';
}


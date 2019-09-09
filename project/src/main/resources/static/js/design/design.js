$('.toggleBoxes .toggleAccord').click(function(e){
    var currentAttrValue = $(this).data('accord');
    if ($(e.target).is('.active')) {
      toggleBox();
    } else {
      toggleBox();
      $(this).parents('.toggleBoxes').addClass('active');
      $(this).addClass('active');
      $(this).find('span.plusImg').addClass('active');
      $('.artWorkBox, .uploadedtext_info, .artworkInside').hide();
      $('.artworkadd_btn, .textadd_btn').removeClass('active');
      $(this).parents('.colors_sec').find('span.plusImg').addClass('active');
      $(this).parents('.colors_sec').find('span.colorNameBox').addClass('active');
      $('.toggleBoxes #' + currentAttrValue).slideDown(300).addClass('open');
    }
    e.preventDefault();s('open');})



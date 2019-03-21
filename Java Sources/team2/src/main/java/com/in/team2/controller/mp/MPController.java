package com.in.team2.controller.mp;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

import com.in.team2.service.mp.MPService;
import com.in.team2.vo.MPVO;
@Scope("prototype")
@Controller
public class MPController {
	@Autowired
	private MPService mpServiceService;
	
	@RequestMapping(value = "/MP_seacrhPrice")
	public ModelAndView search(MPVO mp){
		ModelAndView mav = new ModelAndView();
			
		mav.addObject("mp",mpServiceService.search(mp));
		
		
		if(mp.getSearchInterval().equals("week")){
			mav.addObject("searchInterval","１週間");
		}
		else if(mp.getSearchInterval().equals("month")){
			mav.addObject("searchInterval","１ヶ月間");
			
		}
		else if(mp.getSearchInterval().equals("3months")){
			mav.addObject("searchInterval","３ヶ月間");
			
		}
		else if(mp.getSearchInterval().equals("6months")){
			mav.addObject("searchInterval","６ヶ月間");
			
		}
		else if(mp.getSearchInterval().equals("year")){
			mav.addObject("searchInterval","１年間");
		}
		
		
		
		
		List<MPVO> list = mp.getResultSet();		
		mav.setViewName("/marketprice/p_mp_r");
		return mav;
	}
}

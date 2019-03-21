package com.in.team2.dao.user;

import com.in.team2.vo.MsgVO;
import java.util.ArrayList;

public abstract interface UserMsgDAO
{
  public abstract MsgVO showSendedMsg(MsgVO msg);
  
  public abstract MsgVO showReceivedMsg(MsgVO msg);
  
  public abstract MsgVO showSendedMsgDetail(MsgVO paramMsgVO);
  
  public abstract MsgVO showReceivedMsgDetail(MsgVO paramMsgVO);
  
  public abstract int deleteSendedMsgDetail(MsgVO paramMsgVO) throws Exception;
  
  public abstract int deleteReceivedMsgDetail(MsgVO paramMsgVO) throws Exception;
  
  public abstract int createMsg (MsgVO paramMsgVO) throws Exception;
}

package com.greenfox.reddit.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Getter
@Setter
@Service
@Scope(value = "session",
proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Session {

  private String userName;
  private boolean authenticated;

  public String loginChecker(Model model) {
    model.addAttribute("user", userName);
    return authenticated ? "index" : "login";
  }
}

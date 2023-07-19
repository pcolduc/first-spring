package Ksh.firstspring;

import Ksh.firstspring.repository.MemberRepository;
import Ksh.firstspring.repository.MemoryMemberRepository;
import Ksh.firstspring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }
    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();//
    }
}

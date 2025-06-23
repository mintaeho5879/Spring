package com.green.firstserver;

import com.green.firstserver.model.MemoPostReq;
import org.springframework.web.bind.annotation.*;

@RestController //빈(Bean) 등록, 스프링 컨테이너 객체 생성을 대리로 맡긴다., 요청/응답 담당자
public class MemoController {

    @GetMapping("/memo")
    public String getMemo(){
        return "Hello memo!";
    }

    @GetMapping("/memo/{memo_id}")
    public String getMemo(@PathVariable("memo_id") int memoId){
        System.out.println("memo_id is " + memoId);
        return "Hello Board! - memoId: " + memoId;
    }
    @PostMapping("/memo")
    public String postMemo(@RequestBody MemoPostReq req) { //@RequestBody 는 JSON 데이터를 받을거야.
        System.out.println("postMemo is " + req);
        return "Post Memo!";
    }
}

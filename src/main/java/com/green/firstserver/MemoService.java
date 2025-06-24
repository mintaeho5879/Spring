package com.green.firstserver;

import com.green.firstserver.model.MemoGetOneRes;
import com.green.firstserver.model.MemoGetRes;
import com.green.firstserver.model.MemoPostReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service //빈등록
public class MemoService {
    //Persistence DB 작업처리(로직 + DB작업)
    //생성자로 주입받고 싶음.
    private final MemoMapper memoMapper;

    public int insMemo(MemoPostReq req) {
        return memoMapper.insMemo(req);
    }
    public List<MemoGetRes> getMemoList() {
        return memoMapper.selMemoList();
    }
    public MemoGetOneRes selMemo(int id) {
        return memoMapper.selMemo(id);
    }
}

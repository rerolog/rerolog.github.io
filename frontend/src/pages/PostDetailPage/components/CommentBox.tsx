import calendar from '@/assets/icons/ML_calendar-icon.png';
import useUserStore from "@/stores/useUserStore";
import { IComment } from '@/types/model/Comment';

const CommentBox = ({ comment }: { comment: IComment }) => {
    const { userId } = useUserStore();
    return (
        <div className="p-3 py-5">
            <div className="flex justify-between">
                <span className="text-md">{comment.userId}</span>
                {
                    comment.userId === userId && 
                    <div className="text-sm text-gray-400">
                    <button type="button" className="p-2 hover:text-gray-800 ">
                        수정
                    </button>
                    <button type="button" className="hover:text-gray-800 ">
                        삭제
                    </button>
                </div>
                }
            </div>
    
            <div className="flex text-xs py-1">
                <img className="w-4 h-4" src={calendar} alt="calendar" />
                <span className="px-1">{comment.createdAt.slice(0, 10)}</span>
            </div>
            <div className="py-2">{comment.content}</div>
        </div>
    )
};

export default CommentBox;

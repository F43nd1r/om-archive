
solution {
    puzzle = "P068"
    name = "SUM?"
    arm(ARM1) {
        number = 1
        position = -1 to 2
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 1 to -2
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 1 to 3
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 3 to 4
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 9 to -3
        rotation = 3
        size = 3
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to 2
        rotation = 0
    }
    glyph(BONDER) {
        position = 6 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = 5 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 7 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 1 to 1
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = 5 to -2
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = -3 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 9 to 0
        rotation = 0
    }
    track {
        position = 2 to -3
        positions = listOf(0 to 1, -1 to 1, 0 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(4)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                grab()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(6)
                grab()
                rotateCounterClockwise()
                wait(1)
                rotateCounterClockwise()
                reset()
                wait(5)
                repeat()
                wait(9)
                repeat()
                wait(10)
                repeat()
                wait(9)
                repeat()
                wait(10)
                repeat()
                wait(9)
                repeat()
                wait(10)
                repeat()
                wait(9)
                repeat()
                wait(10)
                repeat()
                wait(9)
                repeat()
                wait(10)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(11)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(5)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                wait(1)
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                reset()
                wait(2)
                repeat()
                wait(20)
                repeat()
                wait(20)
                repeat()
                wait(20)
                repeat()
                wait(20)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(24)
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                reset()
                wait(10)
                repeat()
                wait(20)
                repeat()
                wait(20)
                repeat()
                wait(20)
                repeat()
                wait(20)
                repeat()
            }
        }
        )
    }
}

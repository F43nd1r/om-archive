
solution {
    puzzle = "P068"
    name = "B X S 6T"
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
        position = 4 to 3
        rotation = 3
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
        position = 5 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 6 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = 6 to 1
        rotation = -1
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
        position = 2 to -2
        positions = listOf(0 to 0, -1 to 0, 0 to -1)
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
                wait(4)
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
                wait(1)
                rotateClockwise()
                back()
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
                wait(1)
                rotateClockwise()
                back()
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
                wait(1)
                rotateClockwise()
                back()
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
                wait(1)
                rotateClockwise()
                back()
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
                wait(1)
                rotateClockwise()
                back()
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
                wait(1)
                rotateClockwise()
                back()
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
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(10)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                reset()
                wait(4)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                wait(2)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(25)
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
                wait(11)
                repeat()
                wait(21)
                repeat()
                wait(21)
                repeat()
                wait(21)
                repeat()
                wait(21)
                repeat()
            }
        }
        )
    }
}


solution {
    puzzle = "P068"
    name = "B X S"
    arm(ARM1) {
        number = 1
        position = -2 to 3
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 1 to -1
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -2 to 4
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -1 to 3
        rotation = 5
        size = 1
    }
    arm(ARM6) {
        number = 5
        position = 1 to 4
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 5 to 4
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = 5 to -3
        rotation = 2
        size = 3
    }
    glyph(BONDER) {
        position = 0 to 3
        rotation = 1
    }
    glyph(BONDER) {
        position = 0 to 5
        rotation = 1
    }
    glyph(BONDER) {
        position = 5 to -1
        rotation = 2
    }
    glyph(BONDER) {
        position = 6 to -1
        rotation = 2
    }
    glyph(BONDER) {
        position = 4 to 2
        rotation = 4
    }
    glyph(UNBONDER) {
        position = 0 to 1
        rotation = 1
    }
    glyph(PURIFICATION) {
        position = 2 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 1
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = 8 to -3
        rotation = 0
    }
    track {
        position = 1 to -1
        positions = listOf(0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(5) {
                wait(6)
                grab()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(20)
                grab()
                rotateCounterClockwise()
                reset()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(8)
                forward()
                wait(1)
                grab()
                pivotClockwise()
                back()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                wait(5)
                grab()
                pivotClockwise()
                back()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(27)
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                wait(1)
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}

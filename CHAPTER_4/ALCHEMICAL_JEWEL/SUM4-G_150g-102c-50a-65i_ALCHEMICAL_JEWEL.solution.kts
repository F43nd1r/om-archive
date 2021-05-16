
solution {
    puzzle = "P035"
    name = "B F"
    arm(ARM1) {
        number = 1
        position = 8 to -5
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = 7 to -5
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 5 to 1
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 4 to 1
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 6 to -4
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = 3 to -2
        rotation = 2
    }
    glyph(MULTI_BONDER) {
        position = 4 to -2
        rotation = 2
    }
    glyph(CALCIFICATION) {
        position = 2 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 2
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = 9 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 8 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 7 to -2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                grab()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        )
    }
}

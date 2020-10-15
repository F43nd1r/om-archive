
solution {
    puzzle = "P096"
    name = "B X S"
    arm(ARM1) {
        number = 1
        position = 1 to -4
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = 5 to -4
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 1 to 1
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 4 to -3
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 6 to -1
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = 4 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 1 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 4 to 1
        rotation = 0
    }
    glyph(DISPOSAL) {
        position = 2 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 1
        rotation = -2
    }
    io(OUTPUT) {
        index = 1
        position = 6 to -3
        rotation = 1
    }
    io(OUTPUT) {
        index = 2
        position = -1 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 3
        position = 8 to -3
        rotation = -1
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                pivotClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(6)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        )
    }
}

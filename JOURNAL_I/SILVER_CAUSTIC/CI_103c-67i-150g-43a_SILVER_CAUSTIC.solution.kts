
solution {
    puzzle = "P057"
    name = "B X S F"
    arm(ARM1) {
        number = 1
        position = 2 to 0
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 3 to 1
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 3 to -2
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 1 to -1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -1 to -2
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = -2
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = 0 to 1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 2 to -2
        rotation = 3
    }
    io(INPUT) {
        index = 0
        position = 2 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -3 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -3 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 3
        position = 2 to -1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(4)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                rotateCounterClockwise()
                wait(2)
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                wait(2)
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(1)
                grab()
                rotateCounterClockwise()
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
            sequence(5) {
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}

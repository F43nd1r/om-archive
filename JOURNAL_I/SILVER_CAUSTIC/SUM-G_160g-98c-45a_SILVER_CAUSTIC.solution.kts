
solution {
    puzzle = "P057"
    name = "B X S"
    arm(ARM1) {
        number = 1
        position = 2 to 1
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 2 to 0
        rotation = 6
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 1 to 0
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 2 to -1
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 1 to -2
        rotation = 1
        size = 3
    }
    glyph(BONDER) {
        position = -1 to 3
        rotation = -1
    }
    glyph(BONDER) {
        position = 2 to 2
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = 0 to 3
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 0 to 1
        rotation = 2
    }
    io(OUTPUT) {
        index = 0
        position = -3 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 3 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 4 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 3
        position = 1 to 1
        rotation = 0
    }
    track {
        position = 0 to -1
        positions = listOf(0 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(3)
                rotateClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(6)
                grab()
                back()
                reset()
                wait(5)
                grab()
                back()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
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
            sequence(2) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                wait(1)
                grab()
                rotateClockwise()
                pivotClockwise()
                reset()
            }
        }
        )
    }
}

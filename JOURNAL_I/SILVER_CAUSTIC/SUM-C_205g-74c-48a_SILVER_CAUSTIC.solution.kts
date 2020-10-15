
solution {
    puzzle = "P057"
    name = "B CGX"
    arm(ARM1) {
        number = 1
        position = 6 to 0
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 5 to -1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 2 to -1
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 3 to -2
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 2 to -2
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 1 to -2
        rotation = 1
        size = 3
    }
    glyph(BONDER) {
        position = 0 to 2
        rotation = -1
    }
    glyph(MULTI_BONDER) {
        position = 4 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to 2
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 1 to 0
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = 6 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 5 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 0 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 3
        position = 2 to 0
        rotation = 0
    }
    track {
        position = 1 to -2
        positions = listOf(1 to 0, 0 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(3)
                forward()
                grab()
                back()
                reset()
                wait(2)
                forward()
                grab()
                back()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                forward()
                reset()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(3)
                repeat()
            }
        }
        )
    }
}

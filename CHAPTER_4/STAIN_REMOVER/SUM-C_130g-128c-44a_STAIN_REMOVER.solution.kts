
solution {
    puzzle = "P034"
    name = "B S F"
    arm(ARM1) {
        number = 1
        position = -3 to 4
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -1 to 3
        rotation = 3
        size = 3
    }
    arm(ARM6) {
        number = 3
        position = 4 to 0
        rotation = 0
        size = 1
    }
    glyph(MULTI_BONDER) {
        position = 3 to 0
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = 0 to -2
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = -3 to 3
        rotation = 2
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 5 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 5 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -2 to 3
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(9)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                wait(2)
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(8)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}


solution {
    puzzle = "P096"
    name = "SUM RECORD (Copy)"
    arm(ARM1) {
        number = 1
        position = -4 to -4
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -4 to 1
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 0 to -4
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -1 to -3
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 1 to -1
        rotation = -3
        size = 2
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -4 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 1
        rotation = 0
    }
    glyph(DISPOSAL) {
        position = -3 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -6 to 3
        rotation = 3
    }
    io(INPUT) {
        index = 0
        position = -7 to -1
        rotation = -4
    }
    io(OUTPUT) {
        index = 1
        position = -6 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 2
        position = 1 to -3
        rotation = -4
    }
    io(OUTPUT) {
        index = 3
        position = 1 to 1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(2)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                pivotCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(1)
                grab()
                pivotClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(5) {
                wait(6)
                grab()
                rotateClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
            }
        }
        )
    }
}

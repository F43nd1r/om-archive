
solution {
    puzzle = "P056"
    name = "OVERLAP AREA"
    arm(ARM1) {
        number = 1
        position = 1 to -2
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 1 to -1
        rotation = -3
        size = 2
    }
    glyph(BONDER) {
        position = 0 to -2
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -1
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = 0 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to -3
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
                grab()
                pivotCounterClockwise()
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
                reset()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(8)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(2)
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(2)
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}

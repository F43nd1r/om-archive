
solution {
    puzzle = "P056"
    name = "B AG"
    arm(PISTON) {
        number = 1
        position = 1 to -2
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 2 to -1
        rotation = 3
        size = 3
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = 5
    }
    io(OUTPUT) {
        index = 0
        position = -2 to -1
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = 1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 0 to -2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                extend()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(11)
                grab()
                pivotCounterClockwise()
                wait(3)
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(6)
                pivotCounterClockwise()
                wait(3)
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}

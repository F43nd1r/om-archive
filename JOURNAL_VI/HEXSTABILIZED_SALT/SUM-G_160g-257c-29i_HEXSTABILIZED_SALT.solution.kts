
solution {
    puzzle = "P091b"
    name = "B II"
    arm(ARM1) {
        number = 1
        position = 0 to 3
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 3 to 0
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 3
        position = -1 to -2
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 3 to -2
        rotation = 2
        size = 1
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 1 to 0
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = 1 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 2
        rotation = 1
    }
    track {
        position = -1 to -2
        positions = listOf(0 to 0, 1 to -1)
    }
    track {
        position = 1 to 2
        positions = listOf(2 to -2, 2 to -3, 2 to -4, 2 to -5)
    }
    conduit {
        id = 100
        position = -2 to -1
        rotation = 0
    }
    conduit {
        id = 100
        position = -3 to 1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(3) {
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                retract()
                drop()
                extend()
                grab()
                forward()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                wait(7)
                pivotClockwise()
                reset()
                wait(4)
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                wait(10)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(13)
                grab()
                pivotCounterClockwise()
                forward()
                reset()
            }
        }
        )
    }
}

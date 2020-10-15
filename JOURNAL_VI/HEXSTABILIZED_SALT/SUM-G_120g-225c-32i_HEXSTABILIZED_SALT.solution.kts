
solution {
    puzzle = "P091b"
    name = "B X S"
    arm(ARM1) {
        number = 1
        position = 0 to -3
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 3 to -2
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 3
        position = 0 to 3
        rotation = 3
        size = 1
    }
    glyph(BONDER) {
        position = -3 to 3
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 2 to -3
        rotation = 2
    }
    glyph(CALCIFICATION) {
        position = -2 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to -1
        rotation = 0
    }
    track {
        position = 3 to -1
        positions = listOf(0 to 0, 0 to -1)
    }
    conduit {
        id = 100
        position = 1 to -1
        rotation = 0
    }
    conduit {
        id = 100
        position = -1 to 3
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                wait(4)
                grab()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                back()
                drop()
                forward()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(10)
                grab()
                extend()
                pivotCounterClockwise()
                extend()
                drop()
                retract()
                grab()
                pivotCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}

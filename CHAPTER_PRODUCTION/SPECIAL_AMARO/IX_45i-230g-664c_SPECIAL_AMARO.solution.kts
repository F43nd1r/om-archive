
solution {
    puzzle = "P083"
    name = "INSTRUCTIONS"
    arm(ARM1) {
        number = 1
        position = 1 to 0
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 1 to -2
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = 8 to -2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 10 to -1
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 6 to 2
        rotation = 0
        size = 1
    }
    glyph(MULTI_BONDER) {
        position = 9 to -1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -1 to 0
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 8 to 0
        rotation = 3
    }
    track {
        position = 1 to -2
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = 7 to -1
        positions = listOf(0 to 0, 1 to -1)
    }
    track {
        position = 10 to 0
        positions = listOf(0 to 0, 0 to -1)
    }
    track {
        position = 7 to 1
        positions = listOf(0 to 0, -1 to 1)
    }
    conduit {
        id = 100
        position = 2 to 0
        rotation = 0
    }
    conduit {
        id = 100
        position = 9 to -2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                forward()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                extend()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                extend()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(6)
                grab()
                extend()
                back()
                reset()
                wait(2)
                grab()
                extend()
                back()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(17)
                grab()
                back()
                pivotCounterClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(14)
                grab()
                back()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}

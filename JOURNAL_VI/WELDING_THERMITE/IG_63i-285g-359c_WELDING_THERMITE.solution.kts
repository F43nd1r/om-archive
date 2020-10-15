
solution {
    puzzle = "P094"
    name = "B IG 1-2T"
    arm(PISTON) {
        number = 1
        position = -3 to 4
        rotation = 2
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = -2 to 3
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 6 to 5
        rotation = -1
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = 6 to 1
        rotation = 2
        size = 2
    }
    arm(PISTON) {
        number = 5
        position = 7 to 1
        rotation = 2
        size = 3
    }
    glyph(BONDER) {
        position = 5 to 3
        rotation = 1
    }
    glyph(TRIPLEX_BONDER) {
        position = -5 to 3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -4 to 3
        rotation = 1
    }
    glyph(PROJECTION) {
        position = 5 to 2
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = -2 to 1
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = -5 to 5
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 7 to 3
        rotation = -1
    }
    io(INPUT) {
        index = 1
        position = 4 to 3
        rotation = 0
    }
    track {
        position = 6 to 1
        positions = listOf(0 to 0, 1 to 0, 2 to 0)
    }
    track {
        position = -2 to 3
        positions = listOf(0 to 0, -1 to 0)
    }
    conduit {
        id = 100
        position = 4 to 5
        rotation = 2
    }
    conduit {
        id = 100
        position = -4 to 1
        rotation = -2
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                pivotCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                extend()
                pivotClockwise()
                pivotCounterClockwise()
                drop()
                retract()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(4) {
                wait(18)
                grab()
                retract()
                drop()
                extend()
                wait(2)
                grab()
                forward()
                extend()
                drop()
                retract()
                back()
            }
        }
        , 
        {
            sequence(5) {
                wait(16)
                grab()
                retract()
                retract()
                wait(1)
                extend()
                drop()
                extend()
                grab()
                pivotClockwise()
                forward()
                drop()
                wait(2)
                back()
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
                wait(25)
                grab()
                rotateClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                extend()
                drop()
                retract()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                retract()
                drop()
                forward()
                grab()
                extend()
                drop()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                rotateCounterClockwise()
                drop()
                wait(7)
                grab()
                drop()
                back()
                rotateClockwise()
            }
        }
        )
    }
}

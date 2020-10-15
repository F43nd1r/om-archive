
solution {
    puzzle = "P109"
    name = "B S 1-6T"
    arm(PISTON) {
        number = 1
        position = 7 to 1
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 4 to 7
        rotation = 5
        size = 3
    }
    arm(PISTON) {
        number = 3
        position = 9 to 3
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 7 to 5
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = 5 to 5
        rotation = 1
    }
    glyph(BONDER) {
        position = 5 to 4
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 6 to 2
        rotation = 1
    }
    glyph(PROJECTION) {
        position = 5 to 3
        rotation = 8
    }
    io(OUTPUT) {
        index = 0
        position = 8 to 2
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = 7 to 2
        rotation = 5
    }
    io(INPUT) {
        index = 1
        position = 7 to 4
        rotation = 0
    }
    track {
        position = 8 to 3
        positions = listOf(1 to 0, 0 to 1, -1 to 2)
    }
    conduit {
        id = 100
        position = 2 to 6
        rotation = 0
    }
    conduit {
        id = 100
        position = 4 to 6
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                forward()
                retract()
                drop()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(1)
                grab()
                rotateClockwise()
                wait(1)
                retract()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(6)
                grab()
                rotateClockwise()
                back()
                drop()
                grab()
                forward()
                drop()
            }
        }
        )
    }
}

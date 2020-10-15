
solution {
    puzzle = "P109"
    name = "B X II 1-6T"
    arm(ARM1) {
        number = 1
        position = 7 to 4
        rotation = 3
        size = 3
    }
    arm(ARM6) {
        number = 2
        position = 6 to 3
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = 10 to 1
        rotation = 3
        size = 1
    }
    arm(ARM6) {
        number = 4
        position = 8 to 4
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = 7 to 1
        rotation = 2
    }
    glyph(BONDER) {
        position = 5 to 5
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 5 to 3
        rotation = 1
    }
    glyph(PROJECTION) {
        position = 7 to 2
        rotation = 5
    }
    io(OUTPUT) {
        index = 0
        position = 8 to 2
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = 4 to 4
        rotation = 7
    }
    io(INPUT) {
        index = 1
        position = 9 to 1
        rotation = 0
    }
    track {
        position = 8 to 3
        positions = listOf(0 to 0, -1 to 1, -1 to 2, 0 to 1)
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
            sequence(3) {
                wait(4)
                grab()
                extend()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                pivotCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(6)
                grab()
                back()
                rotateClockwise()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                back()
                drop()
                forward()
                wait(4)
                extendTape()
            }
        }
        )
    }
}

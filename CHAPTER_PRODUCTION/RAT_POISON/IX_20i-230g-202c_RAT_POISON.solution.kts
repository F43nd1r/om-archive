
solution {
    puzzle = "P074"
    name = "20I"
    arm(ARM6) {
        number = 1
        position = 0 to 1
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -3 to 2
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 5 to -3
        rotation = 1
        size = 2
    }
    arm(ARM6) {
        number = 4
        position = -1 to -1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 2 to -1
        rotation = 2
        size = 1
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = -2
    }
    glyph(UNBONDER) {
        position = 0 to 2
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = -1 to 2
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -2 to 1
        rotation = 0
    }
    glyph(DISPOSAL) {
        position = 7 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to -1
        rotation = -4
    }
    io(INPUT) {
        index = 0
        position = 1 to 0
        rotation = -15
    }
    track {
        position = 5 to -2
        positions = listOf(0 to 0, 0 to -1)
    }
    track {
        position = -3 to 2
        positions = listOf(0 to 0, 0 to -1, -1 to -1, -1 to 0, -1 to 1, 0 to 1)
    }
    track {
        position = 2 to -1
        positions = listOf(0 to 0, 0 to -1, -1 to -1, -1 to 0)
    }
    conduit {
        id = 100
        position = 5 to -1
        rotation = -10
        positions = listOf(0 to 0, 0 to 1)
    }
    conduit {
        id = 100
        position = -1 to 3
        rotation = -4
        positions = listOf(0 to 0, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(6)
                grab()
                rotateClockwise()
                back()
                drop()
                forward()
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
            }
        }
        , 
        {
            sequence(1) {
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                wait(3)
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                forward()
                forward()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(5) {
                wait(14)
                forward()
                drop()
                wait(4)
                grab()
            }
        }
        )
    }
}


solution {
    puzzle = "P074"
    name = "24I"
    arm(ARM6) {
        number = 1
        position = 0 to 1
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -1 to 3
        rotation = -2
        size = 2
    }
    arm(ARM3) {
        number = 3
        position = -3 to 2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 5 to -3
        rotation = 1
        size = 2
    }
    arm(ARM6) {
        number = 5
        position = -1 to -1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 1 to -2
        rotation = 1
        size = 2
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
        position = -2 to 3
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = 2 to -3
        positions = listOf(0 to 0, 0 to 1, -1 to 1, -1 to 0)
    }
    conduit {
        id = 100
        position = -4 to 3
        rotation = -1
        positions = listOf(0 to 0, 0 to 1)
    }
    conduit {
        id = 100
        position = 4 to -1
        rotation = -7
        positions = listOf(0 to 0, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(4) {
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
            sequence(3) {
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(3)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                back()
                reset()
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
        , 
        {
            sequence(6) {
                wait(34)
                grab()
                forward()
                drop()
                back()
                back()
            }
        }
        )
    }
}


solution {
    puzzle = "P012"
    name = "NEW SOLUTION 3 (Copy)"
    arm(ARM6) {
        number = 1
        position = -8 to -3
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -7 to -3
        rotation = -4
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -12 to -1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -14 to 0
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -7 to -1
        rotation = -3
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -6 to 0
        rotation = -3
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = -10 to 1
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = -13 to 3
        rotation = -1
        size = 3
    }
    arm(ARM6) {
        number = 9
        position = -11 to 2
        rotation = -1
        size = 2
    }
    glyph(BONDER) {
        position = -11 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = -9 to 0
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -7 to -2
        rotation = 2
    }
    glyph(PROJECTION) {
        position = -9 to -2
        rotation = 2
    }
    io(OUTPUT) {
        index = 0
        position = -9 to 2
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = -11 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -9 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -8 to -2
        rotation = 0
    }
    track {
        position = -13 to 0
        positions = listOf(0 to 0, -1 to 0, 0 to -1, 1 to -1)
    }
    track {
        position = -7 to 0
        positions = listOf(0 to 0, 1 to 0, 1 to -1, 0 to -1)
    }
    track {
        position = -12 to 3
        positions = listOf(0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(3) {
                grab()
                back()
                back()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                back()
                back()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(2)
                grab()
                back()
                back()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                back()
                back()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
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
        , 
        {
            sequence(9) {
                wait(4)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(2)
                grab()
                back()
                reset()
            }
        }
        )
    }
}

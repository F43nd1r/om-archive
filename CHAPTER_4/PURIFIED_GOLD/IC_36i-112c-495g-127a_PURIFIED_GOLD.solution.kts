
solution {
    puzzle = "P036"
    name = "NEW SOLUTION 7"
    arm(ARM6) {
        number = 1
        position = -3 to 4
        rotation = 0
        size = 3
    }
    arm(ARM6) {
        number = 2
        position = -2 to 3
        rotation = 0
        size = 3
    }
    arm(ARM6) {
        number = 3
        position = 3 to 2
        rotation = 0
        size = 1
    }
    arm(ARM3) {
        number = 4
        position = 2 to -2
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -3 to 3
        rotation = 1
        size = 2
    }
    arm(ARM6) {
        number = 6
        position = -6 to 5
        rotation = -1
        size = 2
    }
    arm(ARM6) {
        number = 7
        position = -4 to 9
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = 0 to 3
        rotation = -1
        size = 1
    }
    arm(ARM6) {
        number = 9
        position = -2 to 2
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 10
        position = -2 to 0
        rotation = 0
        size = 1
    }
    glyph(PURIFICATION) {
        position = 1 to 4
        rotation = -2
    }
    glyph(PURIFICATION) {
        position = 1 to 1
        rotation = -2
    }
    glyph(PURIFICATION) {
        position = -5 to 4
        rotation = -2
    }
    glyph(PURIFICATION) {
        position = -2 to 7
        rotation = -2
    }
    glyph(PURIFICATION) {
        position = 2 to 1
        rotation = 1
    }
    glyph(PURIFICATION) {
        position = 0 to 2
        rotation = 2
    }
    glyph(PURIFICATION) {
        position = -4 to 6
        rotation = 4
    }
    glyph(PURIFICATION) {
        position = -1 to 1
        rotation = 3
    }
    glyph(PURIFICATION) {
        position = -1 to -1
        rotation = -8
    }
    io(INPUT) {
        index = 0
        position = 0 to 4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -3 to 7
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 0 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 3
        position = -6 to 4
        rotation = 0
    }
    track {
        position = -2 to 3
        positions = listOf(0 to 1, 0 to 0, -1 to 1)
    }
    track {
        position = 2 to -1
        positions = listOf(0 to 0, 0 to -1)
    }
    track {
        position = -2 to -1
        positions = listOf(0 to 0, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(5)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                forward()
                drop()
                back()
            }
        }
        , 
        {
            sequence(7) {
                wait(5)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(5)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                drop()
                forward()
                grab()
                back()
            }
        }
        , 
        {
            sequence(5) {
                wait(8)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(8)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(11)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(10) {
                wait(18)
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(5)
                grab()
                back()
                reset()
            }
        }
        )
    }
}

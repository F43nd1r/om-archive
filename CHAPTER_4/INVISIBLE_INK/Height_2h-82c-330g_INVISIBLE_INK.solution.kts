
solution {
    puzzle = "P032"
    name = "H2/82C/330G/38A"
    arm(PISTON) {
        number = 1
        position = 4 to 1
        rotation = 3
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 7 to 0
        rotation = 6
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 3 to 0
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 8 to 1
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 2 to 0
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 9 to 1
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = -3 to 1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = 14 to 0
        rotation = -3
        size = 3
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 10 to 0
        rotation = -3
    }
    glyph(CALCIFICATION) {
        position = 7 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 4 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 12 to 1
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 6 to 0
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = 8 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 1
        rotation = 3
    }
    io(INPUT) {
        index = 1
        position = 3 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 12 to 0
        rotation = -3
    }
    track {
        position = 2 to 0
        positions = listOf(0 to 0, -1 to 0)
    }
    track {
        position = 9 to 1
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = -3 to 1
        positions = listOf(0 to 0, -1 to 0, -2 to 0)
    }
    track {
        position = 14 to 0
        positions = listOf(0 to 0, 1 to 0, 2 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                extend()
                reset()
                wait(1)
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                wait(1)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(7)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(8)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(12)
                grab()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(13)
                grab()
                forward()
                forward()
                reset()
            }
        }
        )
    }
}

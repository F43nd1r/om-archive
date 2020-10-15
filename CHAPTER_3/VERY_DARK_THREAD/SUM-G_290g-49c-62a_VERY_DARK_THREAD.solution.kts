
solution {
    puzzle = "P029"
    name = "B CX"
    arm(ARM1) {
        number = 1
        position = 6 to -3
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 5 to -1
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 7 to 0
        rotation = 3
        size = 3
    }
    arm(PISTON) {
        number = 4
        position = 4 to 1
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 4 to -3
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 2 to -2
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = 1 to -2
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = 0 to -1
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 4 to -2
        rotation = 2
    }
    glyph(CALCIFICATION) {
        position = 3 to -2
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 5 to -2
        rotation = 2
    }
    io(INFINITE) {
        index = 0
        position = -9 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 3 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 4 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 6 to -2
        rotation = 0
    }
    track {
        position = 4 to 1
        positions = listOf(0 to 0, -1 to 1)
    }
    track {
        position = 7 to 0
        positions = listOf(0 to 0, 0 to -1, -1 to -1, -2 to 0, -1 to 0)
    }
    track {
        position = 1 to -2
        positions = listOf(0 to 0, 0 to 1, -1 to 1, -2 to 1, -3 to 1)
    }
    tape {
        parallel(
        {
            sequence(5) {
                grab()
                rotateClockwise()
                wait(2)
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(1)
                grab()
                forward()
                wait(1)
                forward()
                forward()
                drop()
                forward()
                forward()
            }
        }
        , 
        {
            sequence(8) {
                wait(11)
                grab()
                forward()
                forward()
                wait(1)
                back()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(8)
                forward()
                grab()
                back()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                extend()
                extend()
                retract()
                forward()
                reset()
            }
        }
        )
    }
}

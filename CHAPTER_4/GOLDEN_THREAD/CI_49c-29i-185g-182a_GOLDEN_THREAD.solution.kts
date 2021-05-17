
solution {
    puzzle = "P037"
    name = "CI"
    arm(ARM1) {
        number = 1
        position = 3 to 2
        rotation = 2
        size = 2
    }
    arm(ARM6) {
        number = 2
        position = 2 to 3
        rotation = -4
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = 2 to 4
        rotation = 5
        size = 3
    }
    arm(ARM6) {
        number = 4
        position = -3 to 3
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -3 to 4
        rotation = 5
        size = 3
    }
    glyph(MULTI_BONDER) {
        position = 1 to 2
        rotation = -1
    }
    io(INFINITE) {
        index = 0
        position = -11 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 5 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to 4
        rotation = 0
    }
    track {
        position = -3 to 3
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = 3 to 4
        positions = listOf(-1 to 0, -2 to 1, -3 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                forward()
                forward()
                drop()
                back()
                back()
            }
        }
        , 
        {
            sequence(4) {
                wait(7)
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
            }
        }
        , 
        {
            sequence(5) {
                wait(11)
                grab()
                pivotCounterClockwise()
                drop()
            }
        }
        )
    }
}

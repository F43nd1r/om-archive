
solution {
    puzzle = "P027"
    name = "B CG"
    arm(ARM1) {
        number = 1
        position = -1 to 0
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = 4 to -3
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 0 to -1
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 1 to 1
        rotation = 3
        size = 1
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = 0 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 2 to -3
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -1 to 3
        rotation = 0
    }
    track {
        position = -2 to 0
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = 3 to -2
        positions = listOf(0 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(9)
                grab()
                rotateClockwise()
                wait(1)
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(1)
                grab()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                back()
                drop()
                forward()
                reset()
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                back()
                reset()
                wait(2)
                repeat()
            }
        }
        )
    }
}

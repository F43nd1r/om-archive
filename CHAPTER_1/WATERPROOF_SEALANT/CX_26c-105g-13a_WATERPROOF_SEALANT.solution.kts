
solution {
    puzzle = "P011"
    name = "B CX"
    arm(ARM1) {
        number = 1
        position = 1 to -1
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 2 to 0
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 0 to -1
        rotation = 6
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 1 to -2
        rotation = 6
        size = 3
    }
    glyph(BONDER) {
        position = 3 to -2
        rotation = 2
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 4 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 3 to -1
        rotation = 0
    }
    track {
        position = 0 to -2
        positions = listOf(0 to 0, 0 to 1, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
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
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                back()
                pivotCounterClockwise()
                back()
                pivotCounterClockwise()
                drop()
                back()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                back()
                grab()
                back()
                pivotCounterClockwise()
                back()
                pivotCounterClockwise()
                drop()
            }
        }
        )
    }
}

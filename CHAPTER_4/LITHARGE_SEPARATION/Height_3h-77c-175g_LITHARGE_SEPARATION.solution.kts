
solution {
    puzzle = "P031b"
    name = "H3"
    arm(ARM1) {
        number = 1
        position = 0 to -1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = 1 to -2
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -2 to -1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 4 to 0
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 6 to -2
        rotation = -4
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 7 to -2
        rotation = -4
        size = 1
    }
    glyph(UNBONDER) {
        position = 1 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 5 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 3 to -1
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = 7 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 2 to -2
        rotation = 0
    }
    track {
        position = -3 to -3
        positions = listOf(2 to 1, 1 to 2, 2 to 2, 3 to 2)
    }
    track {
        position = 6 to 0
        positions = listOf(0 to 0, -1 to 0, -2 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                back()
                reset()
                wait(3)
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(6)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(13)
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                wait(3)
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(10)
                grab()
                back()
                back()
                rotateCounterClockwise()
                drop()
                wait(5)
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(16)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        )
    }
}

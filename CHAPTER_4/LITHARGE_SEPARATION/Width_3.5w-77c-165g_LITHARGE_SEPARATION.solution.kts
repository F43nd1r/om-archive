
solution {
    puzzle = "P031b"
    name = "W3.5"
    arm(ARM1) {
        number = 1
        position = -1 to -3
        rotation = 7
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -3 to -2
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -3 to -3
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 1 to 0
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 3 to 1
        rotation = 3
        size = 3
    }
    glyph(UNBONDER) {
        position = -3 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 0 to 1
        rotation = -9
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to -1
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -2 to -2
        rotation = 0
    }
    track {
        position = -2 to -2
        positions = listOf(0 to -2, -1 to -1, 0 to -1, 1 to -1)
    }
    track {
        position = 0 to 2
        positions = listOf(3 to -1, 2 to 0, 2 to -1, 1 to -1, 1 to -2)
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
            sequence(2) {
                wait(3)
                grab()
                rotateClockwise()
                reset()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(6)
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(10)
                grab()
                pivotCounterClockwise()
                back()
                back()
                back()
                drop()
                forward()
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(14)
                grab()
                pivotClockwise()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                forward()
                drop()
                forward()
                grab()
                back()
                reset()
            }
        }
        )
    }
}

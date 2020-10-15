
solution {
    puzzle = "P080"
    name = "B II 1-7T"
    arm(ARM1) {
        number = 1
        position = -3 to 3
        rotation = 0
        size = 2
    }
    arm(ARM6) {
        number = 2
        position = 0 to 1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 3 to 1
        rotation = 2
        size = 3
    }
    glyph(BONDER) {
        position = -1 to 3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 0 to 2
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = 0 to 0
        rotation = 6
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 4
        rotation = 5
    }
    io(INPUT) {
        index = 0
        position = -1 to 1
        rotation = 1
    }
    track {
        position = -2 to 2
        positions = listOf(0 to 0, -1 to 1, -1 to 2, 0 to 2, 0 to 1)
    }
    track {
        position = 2 to 1
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(10)
                grab()
                back()
                forward()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                drop()
                wait(2)
                grab()
                forward()
                forward()
                drop()
                forward()
                forward()
                grab()
                forward()
            }
        }
        )
    }
}

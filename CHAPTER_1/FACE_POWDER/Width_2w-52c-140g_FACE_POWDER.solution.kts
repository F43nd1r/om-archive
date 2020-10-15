
solution {
    puzzle = "P009"
    name = "W2"
    arm(PISTON) {
        number = 1
        position = -5 to 1
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = -5 to 2
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -1 to -1
        rotation = -4
        size = 1
    }
    glyph(BONDER) {
        position = -3 to 1
        rotation = -2
    }
    glyph(CALCIFICATION) {
        position = 1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -4 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 0
        rotation = -3
    }
    track {
        position = 0 to -1
        positions = listOf(2 to -1, 1 to -1, 0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                extend()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(5)
                grab()
                back()
                back()
                back()
                forward()
                forward()
                reset()
            }
        }
        )
    }
}

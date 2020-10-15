
solution {
    puzzle = "P078"
    name = "B CIX"
    arm(PISTON) {
        number = 1
        position = 0 to 2
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -1 to 3
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -4 to 1
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -4 to 0
        rotation = 1
        size = 2
    }
    arm(PISTON) {
        number = 5
        position = -2 to 3
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 1 to 0
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = 2 to -1
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 8
        position = -1 to 2
        rotation = -1
        size = 1
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -3 to 3
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = -4 to 3
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -3 to 1
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 0 to 0
        rotation = 2
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to 2
        rotation = 3
    }
    track {
        position = -3 to -1
        positions = listOf(0 to 0, -1 to 1, -1 to 2)
    }
    track {
        position = 1 to -1
        positions = listOf(0 to 0, 0 to 1, 0 to 2, 1 to 1, 1 to 0, 1 to -1)
    }
    conduit {
        id = 100
        position = 2 to 2
        rotation = 0
    }
    conduit {
        id = 100
        position = 1 to -2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
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
                wait(1)
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(6)
                grab()
                back()
                back()
                pivotCounterClockwise()
                wait(1)
                back()
                pivotCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(8)
                grab()
                extend()
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                pivotClockwise()
                retract()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(6)
                grab()
                rotateClockwise()
                extend()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(6)
                grab()
                back()
                back()
                pivotCounterClockwise()
                wait(1)
                back()
                pivotCounterClockwise()
                drop()
            }
        }
        )
    }
}

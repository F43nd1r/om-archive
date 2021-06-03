
solution {
    puzzle = "P056"
    name = "OAC"
    arm(PISTON) {
        number = 1
        position = 4 to -2
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 1 to -1
        rotation = 0
        size = 2
    }
    glyph(BONDER) {
        position = 3 to -1
        rotation = 2
    }
    glyph(BONDER) {
        position = 2 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 3 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to -1
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = 3 to -2
        rotation = 0
    }
    track {
        position = 0 to -1
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(2)
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                wait(1)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                wait(1)
                extendTape()
            }
        }
        )
    }
}
